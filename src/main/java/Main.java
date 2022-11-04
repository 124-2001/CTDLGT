public class Main {
    public static void main(String[] args) {
        LogicArray logicArray = new LogicArray();

        /*int[] arrI ={1,3,6,4,6};
        for (int i = 0; i < logicArray.inputAtLv1(arrI,2,1).length; i++) {
            System.out.print(logicArray.inputAtLv1(arrI,2,1)[i]+" ");;
        }*/

        /*int[] arrI ={1,3,6,4,6};
        for (int i = 0; i < logicArray.removeAtLv1(arrI,1).length; i++) {
            System.out.print(logicArray.removeAtLv1(arrI,1)[i]+" ");;
        }*/

        int[] arrI ={1,3,6,4,6};
        int[] arrS ={2,3};
        for (int i = 0; i < logicArray.removeAtLv2(arrI,arrS).length; i++) {
            System.out.print(logicArray.removeAtLv2(arrI,arrS)[i]+" ");;
        }
    }
}

