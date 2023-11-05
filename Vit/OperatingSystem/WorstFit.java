package Vit.OperatingSystem;
public class WorstFit {
    public static void main(String[] args) {
        int memoryblock[]={100 , 500 , 200 , 450 , 600 };
        int process[]={212 , 417 , 112 , 426};
        for(int i=0; i<process.length; i++){
            allocateMemoryBlock(process[i], memoryblock);
        }
        
    }
    private static void allocateMemoryBlock(int p, int[] memoryblock) {
        int best=Integer.MIN_VALUE;
        int temp=-1;
        for(int i=0; i<memoryblock.length;i++){
            if(memoryblock[i]>=p){
                int int_frag=memoryblock[i]-p;
                if(int_frag>=best){
                    temp=i;
                    best=int_frag;
                }
            }
        }
        if(temp!=-1){
            memoryblock[temp]=memoryblock[temp]-p;
            System.out.println("space alloacted to the process with size "+p +" at memory block "+(memoryblock[temp]+p));
        }
    }
}
