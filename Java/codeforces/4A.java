import java.util.*;
public class Watermelon
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w % 2 == 0 && w > 2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
//===============
// public class C{public static void main(String[]a){System.out.print((new java.util.Scanner(System.in).nextInt()-3)%2<1?"NO":"YES");}}
//===============
// import java.util.*;
// import java.io.*;
// public class Main{
//     static class FastReader{
//         BufferedReader br;
//         StringTokenizer st;
//         public FastReader(){
//             br=new BufferedReader(new InputStreamReader(System.in));
//         }
//         String next(){
//             while(st==null || !st.hasMoreTokens()){
//                 try {
//                     st=new StringTokenizer(br.readLine());
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             }
//             return st.nextToken();
//         }
//         int nextInt(){
//             return Integer.parseInt(next());
//         }
//         long nextLong(){
//             return Long.parseLong(next());
//         }
//         double nextDouble(){
//             return Double.parseDouble(next());
//         }
//         String nextLine(){
//             String str="";
//             try {
//                 str=br.readLine().trim();
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//             return str;
//         }
//     }
//     public static void main(String[] args) throws IOException
//     {
//         try {
//             FastReader in=new FastReader();
//             PrintWriter pw=new PrintWriter(System.out);
//             int n=in.nextInt();
//             if(n%2==1)
//             {
//                 pw.println("NO");
//             }
//             else
//             {
//                 if(n==2 || n==1)
//                 {
//                     pw.println("NO");
//                 }
//                 else
//                 {
//                     for(int i=2;i<=n;i+=2)
//                     {
//                         if((i+(n-i))%2==0 && (n-i)%2==0)
//                         {
//                             pw.println("YES");
//                             break;
//                         }
//                     }
//                 }
//             }
//             pw.flush();
//         } catch (Exception e) {
//             return;
//         }
//     }
