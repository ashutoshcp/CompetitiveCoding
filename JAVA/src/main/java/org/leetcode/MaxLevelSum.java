package org.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
    //Definition for a binary tree node.
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public int maxLevelSum(TreeNode root) {
        int maxLevelSum = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int lc = 0;
        for (int level = 1; queue.size() != 0; level++) {
            int size = queue.size();
            int curr = 0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                curr += poll.val;
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            if (curr > maxLevelSum) {
                maxLevelSum = curr;
                lc = level;
            }
        }
        return lc;
    }
}
