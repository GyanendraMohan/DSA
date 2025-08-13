# Data Structures and Algorithms (DSA) Collection

A comprehensive collection of Data Structures and Algorithms implemented in Java, covering fundamental array problems and advanced algorithms.

## 📋 Table of Contents

- [Array Problems](#array-problems)
- [Advanced Algorithms](#advanced-algorithms)
- [Getting Started](#getting-started)
- [Algorithm Analysis](#algorithm-analysis)
- [Contributing](#contributing)
- [Author](#author)

## 🧮 Array Problems

### 1. Maximum Consecutive Ones

**File**: `MaximumConsecutiveOnes.java`

- **Problem**: Find the maximum number of consecutive 1s in a binary array
- **Example**: `[0, 1, 1, 0, 1, 1, 1, 1]` → `4`
- **Time Complexity**: O(n²) - Brute force approach
- **Space Complexity**: O(1)
- **Algorithm**: For each position, count consecutive 1s until a 0 is encountered

### 2. Leaders in Array

**File**: `LeadersInArray.java`

- **Problem**: Find all leaders in an array (elements greater than all elements on their right)
- **Example**: `[7, 10, 4, 3, 10, 6, 5, 2]` → Leaders: `[10, 10, 6, 5, 2]`
- **Time Complexity**: O(n²) - Brute force approach
- **Space Complexity**: O(1)
- **Algorithm**: For each element, check if it's greater than all elements on its right

### 3. Leaders in Array (Efficient)

**File**: `LeaderInArrayEfficient.java`

- **Problem**: Find all leaders in an array using optimized approach
- **Example**: `[7, 10, 4, 3, 10, 6, 5, 2]` → Leaders: `[2, 5, 6, 10]`
- **Time Complexity**: O(n) - Single pass approach
- **Space Complexity**: O(1)
- **Algorithm**: Traverse from right to left, keeping track of current leader

### 4. Frequency in Sorted Array

**File**: `FrequencyInSortedArray.java`

- **Problem**: Count frequency of each element in a sorted array
- **Example**: `[2, 2, 2, 3, 3, 5, 5, 10, 10]` → `2:3, 3:2, 5:2, 10:2`
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Single pass through sorted array, counting consecutive same elements

### 5. Maximum Difference

**File**: `MaximumDifference.java`

- **Problem**: Find maximum difference between two elements where larger element comes after smaller
- **Example**: `[2, 3, 10, 6, 4, 8, 1]` → `8` (10-2)
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Keep track of minimum element and maximum difference

### 6. Move Zeros to End

**File**: `MoveZerosToEnd.java`

- **Problem**: Move all zeros to the end while maintaining relative order of non-zero elements
- **Example**: `[8, 5, 0, 10, 0, 20]` → `[8, 5, 10, 20, 0, 0]`
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Use two-pointer technique

### 7. Move Zeros to End (Efficient)

**File**: `MoveZeroToEndEfficient.java`

- **Problem**: Optimized version of moving zeros to end
- **Example**: `[8, 5, 0, 10, 0, 20]` → `[8, 5, 10, 20, 0, 0]`
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Single pass with optimized swapping

### 8. Remove Duplicates from Array

**File**: `RemoveDuplicateFromArray.java`

- **Problem**: Remove duplicates from sorted array and return new length
- **Example**: `[1, 1, 2, 2, 3, 4, 4, 5]` → `[1, 2, 3, 4, 5]` (length: 5)
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Two-pointer technique for in-place removal

### 9. Remove Duplicates from Array (Efficient)

**File**: `RemoveDuplicateFromArrayEfficient.java`

- **Problem**: Optimized version of removing duplicates
- **Example**: `[1, 1, 2, 2, 3, 4, 4, 5]` → `[1, 2, 3, 4, 5]` (length: 5)
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Single pass with optimized comparison

### 10. Maximum Sum SubArray

**File**: `MaximumSumSubArray.java`

- **Problem**: Find the subarray with maximum sum (Kadane's Algorithm variant)
- **Example**: `[2, 3, -8, 7, -1, 2, 3]` → `11` (subarray: [7, -1, 2, 3])
- **Time Complexity**: O(n²) - Brute force approach
- **Space Complexity**: O(1)
- **Algorithm**: Check all possible subarrays and find the one with maximum sum

### 11. Longest Even-Odd SubArray

**File**: `LongestEvenOddSubArray.java`

- **Problem**: Find the length of the longest subarray with alternating even and odd numbers
- **Example**: `[10, 12, 14, 7, 8]` → `2` (subarray: [14, 7] or [7, 8])
- **Time Complexity**: O(n) - Single pass approach
- **Space Complexity**: O(1)
- **Algorithm**: Traverse array and count consecutive alternating even-odd pairs

### 12. Maximum Circular SubArray Sum

**File**: `MaximumCircularSubArraySum.java`

- **Problem**: Find the maximum sum of subarray in a circular array (subarray can wrap around)
- **Example**: `[5, -2, 3, 4]` → `10` (subarray: [3, 4, 5] wrapping around)
- **Time Complexity**: O(n²) - Brute force approach trying all positions and lengths
- **Space Complexity**: O(1)
- **Algorithm**: For each starting position, try all possible circular subarray lengths using modulo indexing

### 13. Sliding Window (Brute Force)

**File**: `SlidingWindow.java`

- **Problem**: Find the maximum sum of any consecutive subarray of size `k` in a given array.
- **Example**: `[1, 8, 30, -5, 20, 7]`, `k = 3` → `45` (subarray: `[30, -5, 20]`)
- **Time Complexity**: O(n \* k) - For each window, sum up k elements
- **Space Complexity**: O(1)
- **Algorithm**: For every possible window of size `k`, calculate the sum and keep track of the maximum.

### 14. Sliding Window (Optimal)

**File**: `OptimalSlidingWIndow.java`

- **Problem**: Find the maximum sum of any consecutive subarray of size `k` in a given array using an optimized approach.
- **Example**: `[1, 8, 30, -5, 20, 7]`, `k = 3` → `45` (subarray: `[30, -5, 20]`)
- **Time Complexity**: O(n) - Each element is added and removed from the window once
- **Space Complexity**: O(1)
- **Algorithm**: Calculate the sum of the first window of size `k`. Then, for each subsequent window, subtract the element going out and add the new element coming in, updating the maximum sum as you go.

## 🚀 Advanced Algorithms

### 13. Stock Buy and Sell

**File**: `StockBuyAndSell.java`

- **Problem**: Find maximum profit from buying and selling stocks multiple times
- **Example**: `[1, 5, 3, 8, 12]` → `13` (buy at 1, sell at 5, buy at 3, sell at 8, buy at 8, sell at 12)
- **Time Complexity**: O(n²) - Recursive approach
- **Space Complexity**: O(n) - Stack space for recursion
- **Algorithm**: Recursive approach considering all possible buy-sell combinations

### 14. Trapping Rain Water

**File**: `TrappingRainWater.java`

- **Problem**: Calculate how much water can be trapped between bars
- **Example**: `[3, 0, 1, 2, 5]` → `6` units of water
- **Time Complexity**: O(n) - Two-pointer approach
- **Space Complexity**: O(1)
- **Algorithm**: Two-pointer technique with left and right maximum tracking

### 15. Majority Element in Array

**File**: `MajorityElements.java`

- **Problem**: Find the majority element in an array (an element that appears more than n/2 times).
- **Example**: `[1, 2, 3, 3, 3, 4, 5, 6, 3, 3, 3]` → `3` (since 3 appears 6 times in an array of length 11)
- **Time Complexity**: O(n) - Boyer-Moore Voting Algorithm
- **Space Complexity**: O(1)
- **Algorithm**:
  1. **Candidate Selection**: Use the Boyer-Moore Voting Algorithm to find a candidate for the majority element by maintaining a count and a candidate variable.
  2. **Verification**: After finding the candidate, verify if it actually appears more than n/2 times in the array.
- **Edge Cases**: If no majority element exists, the algorithm should indicate so (e.g., return -1 or a message).

**Sample Java Implementation:**

```java
public static int findMajorityElement(int[] arr) {
    int count = 0, candidate = -1;
    for (int num : arr) {
        if (count == 0) {
            candidate = num;
            count = 1;
        } else if (num == candidate) {
            count++;
        } else {
            count--;
        }
    }
    // Verify candidate
    count = 0;
    for (int num : arr) {
        if (num == candidate) count++;
    }
    return (count > arr.length / 2) ? candidate : -1;
}
```

## 🛠️ Getting Started

### Prerequisites

- Java JDK 8 or higher
- Git (for cloning)

### Installation

1. **Clone the repository**:

```bash
git clone https://github.com/GyanendraMohan/DSA.git
cd DSA
```

2. **Compile and run any Java file**:

```bash
# Compile
javac AlgorithmName.java

# Run
java AlgorithmName
```

### Example Usage

```bash
# Run Maximum Consecutive Ones
javac MaximumConsecutiveOnes.java
java MaximumConsecutiveOnes

# Run Leaders in Array
javac LeadersInArray.java
java LeadersInArray

# Run Trapping Rain Water
javac TrappingRainWater.java
java TrappingRainWater

# Run Maximum Sum SubArray
javac MaximumSumSubArray.java
java MaximumSumSubArray

# Run Longest Even-Odd SubArray
javac LongestEvenOddSubArray.java
java LongestEvenOddSubArray

# Run Maximum Circular SubArray Sum
javac MaximumCircularSubArraySum.java
java MaximumCircularSubArraySum
```

## 📊 Algorithm Analysis

### Time Complexity Summary

| Algorithm                    | Best Case | Average Case | Worst Case | Space |
| ---------------------------- | --------- | ------------ | ---------- | ----- |
| Maximum Consecutive Ones     | O(n²)     | O(n²)        | O(n²)      | O(1)  |
| Leaders in Array             | O(n²)     | O(n²)        | O(n²)      | O(1)  |
| Leaders in Array (Efficient) | O(n)      | O(n)         | O(n)       | O(1)  |
| Frequency in Sorted Array    | O(n)      | O(n)         | O(n)       | O(1)  |
| Maximum Difference           | O(n)      | O(n)         | O(n)       | O(1)  |
| Move Zeros to End            | O(n)      | O(n)         | O(n)       | O(1)  |
| Remove Duplicates            | O(n)      | O(n)         | O(n)       | O(1)  |
| Sliding Window (Brute Force) | O(n\*k)   | O(n\*k)      | O(n\*k)    | O(1)  |
| Sliding Window (Optimal)     | O(n)      | O(n)         | O(n)       | O(1)  |
| Maximum Sum SubArray         | O(n²)     | O(n²)        | O(n²)      | O(1)  |
| Longest Even-Odd SubArray    | O(n)      | O(n)         | O(n)       | O(1)  |
| Maximum Circular SubArray    | O(n²)     | O(n²)        | O(n²)      | O(1)  |
| Stock Buy and Sell           | O(n²)     | O(n²)        | O(n²)      | O(n)  |
| Trapping Rain Water          | O(n)      | O(n)         | O(n)       | O(1)  |
| Majority Element in Array    | O(n)      | O(n)         | O(n)       | O(1)  |

### Key Features

- **In-place algorithms**: Most algorithms modify arrays in-place
- **Constant space**: Most algorithms use O(1) extra space
- **Multiple approaches**: Both brute force and optimized solutions
- **Comprehensive testing**: Each algorithm includes test cases

## 🧪 Testing

Each algorithm includes:

- **Multiple test cases** covering edge cases
- **Input validation** for null/empty arrays
- **Clear output formatting** for easy understanding
- **Performance comparison** between different approaches

### Guidelines

- Add comprehensive comments to your code
- Include test cases for your algorithms
- Update the README with new algorithm descriptions
- Follow Java coding conventions

## 👨‍💻 Author

**Gyanendra Mohan Patel**

- **GitHub**: [@GyanendraMohan](https://github.com/GyanendraMohan)
- **Email**: gmpatel152@gmail.com
- **LinkedIn**: [Gyanendra Mohan Patel](https://linkedin.com/in/gyanendra-mohan-patel)

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 🙏 Acknowledgments

- Thanks to all contributors who help improve this collection
- Inspired by various competitive programming problems
- Built for educational and learning purposes

---

⭐ **Star this repository if you find it helpful!**
