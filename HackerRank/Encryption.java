package HackerRank;
// import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        // Scanner in=new Scanner (System.in);
        // System.out.println("Enter the Message");
        String msg="Feedthedog";
        String[] String=msg.split(" ");
        String code="";
        for(int i=0; i<String.length;i++){
            code+=String[i];
        }
        // System.out.println(code);
        double root=code.length();
        double row=Math.floor(Math.sqrt(root));
        double col=Math.ceil(Math.sqrt(root));
        // System.out.println(row+" "+col+" ");
        if(row*col<code.length()){
            row=row+1;
        }
        char[][] encode=new char[(int) row][(int) col];
        String ans="";
        int p=0;
        // System.out.println(row+" "+col+" ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col&&p<code.length();j++,p++){
                encode[i][j]=code.charAt(p);
            }
        }
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col;j++){
        //         System.out.print(encode[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=0; i<col; i++){
            for(int j=0; j<row;j++){
                ans+=encode[j][i];
            }
            ans+=' ';
            // System.out.println();
        }
        ans=ans.trim();
        System.out.println(ans);
    }
}
// s = s.replaceAll("\\s","");
//         int row = (int)Math.floor(Math.sqrt(s.length()));
//         int col = (int)Math.ceil(Math.sqrt(s.length()));
//         if(row*col < s.length()) row++;
//         // System.out.println(row + " " + col + " " + s.length());

//         StringBuilder ans = new StringBuilder();
//         for(int i = 0; i <col; i++){
//             for(int j = 0; j <s.length(); j++){
//                 if(i+j<s.length()){
//                     ans.append(s.charAt(i+j));
//                     j+=col-1;
//                 }
//             }
//             ans.append(" ");
//         }
//         String str = ans.toString();
//         return str;