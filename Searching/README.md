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

| Algorithm     | Best Case | Average Case | Worst Case | Space Complexity |
| ------------- | --------- | ------------ | ---------- | ---------------- |
| Linear Search | O(1)      | O(n)         | O(n)       | O(1)             |

---

_Add more search algorithms to this folder to expand the README!_
