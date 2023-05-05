import java.util.Scanner;
class liner_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[];
        int n, x;
        a = new int[10];
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        System.out.println("\nEnter elements of array: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("\nEnter element to be searched: ");
        x = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(a[i] == x){
                System.out.println("Element found at index: " + i);
                break;
            }
        }
    }
}
