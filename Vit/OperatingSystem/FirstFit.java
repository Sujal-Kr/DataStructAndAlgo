package Vit.OperatingSystem;

public class FirstFit {
    public static void main(String[] args) {

        int memoryblock[]={100 , 500 , 200 , 450 , 600 };
        int process[]={212 , 417 , 112 , 426};
        for(int i=0; i<process.length; i++){
            allocateMemoryBlock(process[i], memoryblock);
        }
        
    }

    private static void allocateMemoryBlock(int p, int[] memoryblock) {
        for(int i=0; i<memoryblock.length; i++){
            if(memoryblock[i]>=p){
                memoryblock[i] = memoryblock[i]-p;
                System.out.println("space alloacted to the process with size "+p +" at memory block "+(memoryblock[i]+p));
                break;
            }
        }
    }
}
