/*

A
B B
C C C
D D D D
E E E E E

 */

package basics.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        char c = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)c+" ");
            }
            c++;
            System.out.println();
        }
    }
}
