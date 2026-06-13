package star_pattern;
/*

12345
12345
12345 
12345
12345

*/
public class Numbers_5N5 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++) {
            for(j=1;j<=n;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
