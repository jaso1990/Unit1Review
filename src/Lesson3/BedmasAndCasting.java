
package Lesson3;


public class BedmasAndCasting {

    public static void main(String[] args) {
        int x = 22;
        int y = x * 2;
        //must cast y t oa double
        double z = (double)y / 7;
        System.out.println("Z is " + z);
        
        //MOD gives the remained from a divide calc
        
        int remain = y % 7; //will give back 2
        System.out.format("%d / 7 = %d, remainder %d\n",y,  y/7, remain);
        
        //BEDMAS
        int e, f, g;
        e = f = g =5;//assign all to 5 at once
        int ans;
        
        ans = e + f * g; //5 + 5 * 5 (30)
        System.out.format("%d + %d * %d = %d\n", e, f, g, ans);
        
        ans = (e + f) * g; //(5 + 5) * 5 (50)
        System.out.format("(%d + %d) * %d = %d\n", e, f, g, ans);
        
        ans = e + f % g; //5 + 5 % 5 (5)
        System.out.format("%d + %d %% %d = %d\n", e, f, g, ans);
        
        ans = (e + f) % g; //(5 + 5) % 5 (0)
        System.out.format("(%d + %d) %% %d = %d\n", e, f, g, ans);
    }
    
}
