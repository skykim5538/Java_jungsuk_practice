package ch2;

public class Ex2_11 {

    public static void main(String args[]){
        short sMin = -32768, sMax = 32767;
        char cMin = 0, cMax =65535;

        System.out.println(sMin);
        //-32768
        System.out.println((short)(sMin-1));
        //-32767.0
        System.out.println(sMax);
        //32767
        System.out.println((short)(sMax+1));
        //32768.0
        System.out.println((int)cMin);
        // 0
        System.out.println((int)--cMax);

        System.out.println((int)cMax);
        System.out.println((int)++cMax);
    }

}
