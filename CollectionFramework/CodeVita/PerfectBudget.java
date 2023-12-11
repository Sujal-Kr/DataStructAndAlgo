// package CollectionFramework.CodeVita;
// import java.util.*;

// public class PerfectBudget {
//     static class Project {
//         int expenditure, reward, penalty, budget;
//         Project(int expenditure, int reward, int penalty, int budget) {
//             this.expenditure = expenditure;
//             this.reward = reward;
//             this.penalty = penalty;
//             this.budget = budget;
//         }
//     }

//     static int minAssignmentCost(Project[] projects) {
//         int n = projects.length;
//         int[][] costs = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 costs[i][j] = Math.abs(projects[i].budget - (projects[i].expenditure + projects[j].reward));
//             }
//         }

//         return costs[0][0];
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n=scanner.nextInt();
//         while (n-- > 0) {
//             int n = scanner.nextInt();
//             Project[] projects = new Project[n];
//             for (int i = 0; i < n; i++) {
//                 int expenditure = scanner.nextInt();
//                 int budget = scanner.nextInt();
//                 int reward = scanner.nextInt();
//                 projects[i] = new Project(expenditure, budget, reward);
//             }
//             System.out.println(minAssignmentCost(projects));
//         }
//     }
// }