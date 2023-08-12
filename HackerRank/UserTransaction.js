async function getNumTransactions(username) {
    // API endpoint: https://jsonmock.hackerrank.com/api/article_users?username=<username>
    // API endpoint: https://jsonmock.hackerrank.com/api/transactions?&userId=<userId>
    
    try {
        // Fetch user information
        const userRes = await fetch(`https://jsonmock.hackerrank.com/api/article_users?username=${username}`);
        const userData = await userRes.json();
    
        if (userData.total === 0) {
          // If no user found, return "Username Not Found"
          return "Username Not Found";
        }
    
        const userId = userData.data[0].id;
        console.log(userId)
    
        // Fetch transactions information using user ID
        const transactionRes = await fetch(`https://jsonmock.hackerrank.com/api/transactions?&userId=${userId}`);
        const transactionData = await transactionRes.json();
        console.log(transactionData.total)
        // Return the number of transactions
        return transactionData.total;
      } catch (err) {
        console.error('Error fetching data:', err);
        throw err;
      }
}

getNumTransactions("epaga");
