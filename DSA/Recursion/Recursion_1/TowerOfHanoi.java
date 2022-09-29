package Recursion_1;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char helper, char destination) {

        /*	************ See Solution Video of Ankush Singla	************    */
        if(disks==0)
            return;
        if(disks==1){
            System.out.println(source+" "+destination);
            return;
        }
        towerOfHanoi(disks-1,source,destination,helper);
        System.out.println(source+" "+destination);
        towerOfHanoi(disks-1,helper,source,destination);

    }
}
