import java.util.Arrays;
import java.util.Scanner;
public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DNALength = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int longestSubsequence = -1;
        int longestSubIndex = -1;
        int longestSubSum = -1;
        int indexOfLongest = 0;
        int[] sequence = new int[DNALength];
        int indexOfSequence = 1;

        while (!"Clone them!".equals(command)){
            int[] currentDNASequence = Arrays.stream(command.split("!+")).mapToInt(Integer::parseInt).toArray();
            int subsequence = -1;
            int subIndex = -1;
            int subSum = 0;
            int count = 0;

            for (int i = 0; i < DNALength; i++) {
                if (currentDNASequence[i] == 1){
                    count++;
                    subSum++;
                    if (count > subsequence){
                        subsequence = count;
                        subIndex = i - 1;
                    }
                }
                else {
                    count = 0;
                }
            }
            if (subsequence > longestSubsequence){
                longestSubsequence = subsequence;
                longestSubIndex = subIndex;
                longestSubSum = subSum;
                indexOfLongest = indexOfSequence;
                sequence = currentDNASequence;
            }
            else if (subsequence == longestSubsequence && longestSubIndex > subIndex){
                longestSubIndex = subIndex;
                longestSubSum = subSum;
                indexOfLongest = indexOfSequence;
                sequence = currentDNASequence;
            }
            else if (subsequence == longestSubsequence && longestSubIndex == subIndex && subSum > longestSubSum){
                longestSubSum = subSum;
                indexOfLongest = indexOfSequence;
                sequence = currentDNASequence;
            }
        indexOfSequence++;
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n",indexOfLongest,longestSubSum);
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}