# Searching Algorithms

This folder contains implementations of basic searching algorithms in Java. Each algorithm is explained with its logic and a table summarizing their time and space complexities.

## 1. Linear Search

Linear Search is the simplest searching algorithm. It checks every element in the array sequentially until the desired element is found or the array ends.

### Theory (Logic Explanation)

- Start at the beginning of the array.
- Compare each element to the target value one by one.
- If a match is found, return the index of that element immediately (or record it, depending on requirements).
- If the end of the array is reached without finding the target, return -1 to indicate the element is not present.
- This method does not require the array to be sorted and works for any type of list or collection.

### Explanation

- Start from the first element and compare each element with the target.
- If a match is found, return the index.
- If the end of the array is reached without finding the element, return -1.

### Complexity Table

| Algorithm               | Best Case | Average Case | Worst Case | Space Complexity |
| ----------------------- | --------- | ------------ | ---------- | ---------------- |
| Linear Search           | O(1)      | O(n)         | O(n)       | O(1)             |
| Iterative Binary Search | O(1)      | O(log n)     | O(log n)   | O(1)             |

---

## 2. Iterative Binary Search

Iterative Binary Search is an efficient algorithm for finding an element in a sorted array. It repeatedly divides the search interval in half, eliminating half of the remaining elements each time.

### Theory (Logic Explanation)

- The array must be sorted.
- Set two pointers, `low` and `high`, at the start and end of the array.
- While `low` is less than or equal to `high`:
  - Calculate `mid = (low + high) / 2`.
  - If `arr[mid]` equals the target, return `mid`.
  - If `arr[mid]` is less than the target, set `low = mid + 1`.
  - If `arr[mid]` is greater than the target, set `high = mid - 1`.
- If the element is not found, return -1.

### Explanation

- Binary search works by repeatedly dividing the search interval in half.
- If the value of the search key is less than the item in the middle, narrow the interval to the lower half. Otherwise, narrow it to the upper half.
- Continue until the value is found or the interval is empty.

### Complexity Table

| Algorithm               | Best Case | Average Case | Worst Case | Space Complexity |
| ----------------------- | --------- | ------------ | ---------- | ---------------- |
| Iterative Binary Search | O(1)      | O(log n)     | O(log n)   | O(1)             |

---

_Add more search algorithms to this folder to expand the README!_
