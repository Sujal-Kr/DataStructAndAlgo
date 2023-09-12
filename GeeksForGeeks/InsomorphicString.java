package GeeksForGeeks;
public class InsomorphicString {
    public static void main(String[] args) {
        String str1="aab";
        String str2="xyy";
        System.out.println(solution(str1, str2));
    }

    private static boolean solution(String str1, String str2) {
        int map[]=new int[256];
        for(int i=0; i<str1.length(); i++){
            if(map[(int)str2.charAt(i)]==0){
                map[(int)str2.charAt(i)]=(int)str1.charAt(i);
            }
            else{
                if(map[(int)str2.charAt(i)]!=(int)str1.charAt(i)){
                    return false;
                }
            }
        }
        
        return true;
    }
}
