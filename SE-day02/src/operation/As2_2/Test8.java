package operation.As2_2;

public class Test8 {
    public static int xzt(int[] arr){
        int[] answer={'A','D','B','C','D'};
        int fens=0;
        for (int i = 0; i < answer.length; i++) {
            if(answer[i]==arr[i]){
                fens+=2;
            }
        }
        return fens;
    }
    public static void main(String[] args) {
        int[] xm={'D','C','B','A','D'};
        int[] xo={'A','D','B','C','D'};
        int[] xh={'A','D','B','C','A'};
        int[] xq={'A','B','C','D','D'};
        System.out.println("满分10分，小明:得分:"+xzt(xm)+"分");
        System.out.println("满分10分，小红:得分:"+xzt(xo)+"分");
        System.out.println("满分10分，小黄:得分:"+xzt(xh)+"分");
        System.out.println("满分10分，小强:得分:"+xzt(xq)+"分");

    }
}
