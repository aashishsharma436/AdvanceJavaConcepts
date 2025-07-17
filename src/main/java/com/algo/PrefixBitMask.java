package com.algo;

/*
A pair of strings S1 and S2 is called a Magical String Pair if both strings are non-empty and have the same set of distinct characters.

For example: abac and bcab is a Magical String Pair as the set of distinct characters in both strings is {a,b,c} while abac and abcd is not because the set of distinct characters in them are not the same ({a,b,c} vs {a,b,c,d}).

An adjacent substrings pair can be represented by a triplet (i, j, k) [i <= j < k], with one string being S[i .. j] and the other string being S[j+1 .. k].

Given a string S of length N, find the number of distinct Magical String Pairs such that the two strings in each pair are adjacent substrings in S.

Two magical pairs are considered different if the corresponding triplets (i, j, k) are different. (X1, Y1, Z1) and (X2, Y2, Z2) are considered different if X1 != X2 or Y1 != Y2 or Z1 != Z2.

Input:
  S = "ababac"
Output:
  4
Explanation:
  Magical Substring Pairs of S are:
  S[0 .. 1], S[2 .. 3] = ab, ab -> {a,b}
  S[0 .. 2], S[3 .. 4] = aba, ba -> {a,b}
  S[0 .. 1], S[2 .. 4] = ab, aba -> {a,b}
  S[1 .. 2], S[3 .. 4] = ba, ba -> {a,b}
 */
public class PrefixBitMask {
    public static void main(String[] args) {
        String str = "ababaac";
        System.out.println(countMagicalPairs(str));
    }

    public static int countMagicalPairs(String S) {
        int n = S.length();
        int[] prefix = new int[n + 1];

        // Precompute prefix bitmasks
        for (int i = 0; i < n; i++) {
            int chBit = 1 << (S.charAt(i) - 'a');
            prefix[i + 1] = prefix[i] | chBit;
        }

        // Function to get bitmask of substring S[l..r]
        // Uses XOR of prefix bitmasks
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) { // j < n - 1 to ensure j+1 <= k
                for (int k = j + 1; k < n; k++) {
                    int bitmask1 = prefix[j + 1] ^ prefix[i];
                    int bitmask2 = prefix[k + 1] ^ prefix[j + 1];
                    if (bitmask1 == bitmask2) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
