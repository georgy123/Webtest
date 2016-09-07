package testgit;

public class TestGit2 {
      public static int fun(int n){
          if(n==0){
              return 0;
          }else if(n==1){
              return 1;
          }
          return n+fun(n-1);
      }
      public static void main(String[] args) {
        
          System.out.println(TestGit2.fun(100));
    }
}
