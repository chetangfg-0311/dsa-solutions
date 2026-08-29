# Maximum Nesting Depth of the Parentheses

- **Platform:** LeetCode
- **URL:** https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
- **Language:** Java
- **Difficulty:** Easy
- **Tags:** String, Stack, Bracket Sequences

## Problem Description

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1:

Input: s = "(1+(2*3)+((8)/4))+1"

Output: 3

Explanation:

Digit 8 is inside of 3 nested parentheses in the string.

Example 2:

Input: s = "(1)+((2))+(((3)))"

Output: 3

Explanation:

Digit 3 is inside of 3 nested parentheses in the string.

Example 3:

Input: s = "()(())((()()))"

Output: 3

Constraints:

1 <= s.length <= 100
s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
It is guaranteed that parentheses expression s is a VPS.

## Solution

See [maximum-nesting-depth-of-the-parentheses.java](maximum-nesting-depth-of-the-parentheses.java) for the submitted solution.

> Synced by CodeSync on 2026-08-29T10:42:35.312Z.