public class LogicArray {
    public int[] inputAtLv1(int[] arrI, int a, int index) {
        int[] new_arrI = new int[arrI.length+1];
        if (index > arrI.length || index < 0) {
            return arrI;
        } else {
            for (int i = 0; i <= arrI.length ; i++) {
                if(i<index-1){
                    new_arrI[i]=arrI[i];
                }
                if(i==index-1){
                    new_arrI[i]=a;
                }
                if(i>index-1){
                    new_arrI[i]=arrI[i-1];
                }
            }
        }
        return new_arrI;
    }

    public int[] removeAtLv1(int[] arrI, int index) {
        int[] new_arrI = new int[arrI.length-1];
        if (index > arrI.length || index < 0) {
            return arrI;
        } else {
            for (int i = 0; i < arrI.length-1 ; i++) {
                if(i<index-1){
                    new_arrI[i]=arrI[i];
                }
                if(i>=index-1){
                    new_arrI[i]=arrI[i+1] ;
                }

            }
        }
        return new_arrI;
    }

    public int[] inputAtLv2(int[] arrI,int[] arrS,int index){
        int[] newArr = new int[arrI.length+arrS.length];
        if(index>arrI.length||index<0){
            for (int i=0;i<newArr.length;i++){
                if(i<arrI.length){
                    newArr[i]=arrI[i];
                }
                else {
                    newArr[i]=arrS[i-arrI.length];
                }
            }
        }
        else {
            for (int i=0;i<newArr.length;i++){
                if(i<index-1){
                    newArr[i]=arrI[i];
                }
                else if(i>=index-1 && i<arrS.length+index-1){
                    newArr[i]=arrS[i-index+1];
                }
                else {
                    newArr[i]=arrI[i-index-1];
                }
            }
        }
        return newArr;
    }

    public int[] removeAtLv2(int[] arrI,int[] arrD){
        int count1=0;
        for (int i = 0; i < arrD.length ; i++) {
            if(arrD[i]>arrI.length){
                arrD[i]=-1;
            }
            for (int j = i+1; j < arrD.length; j++) {
                if(arrD[i]==arrD[j]&&arrD[i]>=0&&arrD[i]<arrD.length){
                    arrD[j]=-1;
                }
            }
            if(arrD[i]!=-1){
                count1++;
            }
        }
        int[] newArr = new int[arrI.length-count1];
        int count3=0;
        for (int i = 1; i <= arrI.length; i++) {
            int count2=0;

            for (int j = 0 ; j < arrD.length; j++) {
                if(arrD[j]>0){
                    if(arrD[j]==i) {
                        count2++;
                    }
                }
            }
            if (count2==0){
                newArr[count3]=arrI[i-1];
                count3++;
            }
        }
        return newArr;
    }


}
