import solutions.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Actual solution :" + solution.isMatch("ab",".*")+ "-"+true);
        System.out.println("Actual solution :" + solution.isMatch("aa",".*")+ "-"+true);
        System.out.println("Actual solution :" + solution.isMatch("aa","a*")+ "-"+true);
        System.out.println("Actual solution :" + solution.isMatch("aa","a")+ "-"+false);
        System.out.println("Actual solution :" + solution.isMatch("aab","c*a*b")+ "-"+true);
        System.out.println("Actual solution :" + solution.isMatch("aaa","aaaa")+ "-"+false);

    }
}