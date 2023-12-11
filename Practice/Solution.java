package Practice;



interface test{
    int score=34;
    void fun();
}
public class Solution implements test{
    Solution(){
        System.out.println(score);
    }
    public void fun(){
        System.out.println("Joey does not share his food");
    }
    public static void main(String[] args) {
        new Solution().fun();
    }
}
