# Redeemer's submission for arkesel-codes.
## Question 1
1. These lines create a new Scanner object called input to read input from the console. The program then prints the prompt "Enter a string:" to the console using System.out.println(). After the user enters a string, the program reads the input and stores it in a string variable called text. The input string is then converted to lowercase using the toLowerCase(Locale.ROOT) method and stored in a string variable called checker.
```java
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();
        String checker = text.toLowerCase(Locale.ROOT);
```
2. These lines initialize a boolean variable isPalindrome to true and two integer variables i and j. i is initialized to 0 which is the index of the first character of the input string, and j is initialized to text.length() - 1 which is the index of the last character of the input string. The program then enters a while loop which continues until i is greater than or equal to j. The loop checks whether the characters at positions i and j in the checker string are equal. If the characters do not match, the program sets isPalindrome to false and breaks out of the loop. The i and j variables are then incremented and decremented, respectively, to move the loop towards the middle of the string.
```java
        boolean isPalindrome = true;
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (checker.charAt(i) != checker.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
```

## Question 2
1. This line defines a public static method called binarySearch that takes an integer array arr and an integer target as input, and returns an integer.
```java
public static int binarySearch(int[] arr, int target) {
```
2. These lines initialize two integer variables, left and right, to represent the left and right indices of the search interval, respectively. left is set to 0 and right is set to the index of the last element in the array.
```java
int left = 0;
int right = arr.length - 1;
```
3. This line computes the midpoint index mid of the search interval by adding the left index to half the difference between the right and left indices. This ensures that mid is always an integer index that is as close to the center of the search interval as possible.
```java
int mid = left + (right - left) / 2;
```
4. These lines use a conditional statement to check whether the value at index mid in the array arr is equal to the target value. If it is, the method returns the mid index as the position of the target value in the array. If it is not, the conditional statement checks whether the value at mid is less than the target value. If it is, the left index is updated to mid + 1, since the target value must be in the upper half of the search interval. If the value at mid is greater than the target value, the right index is updated to mid - 1, since the target value must be in the lower half of the search interval.
```java
if (arr[mid] == target) {
    return mid;
} else if (arr[mid] < target) {
    left = mid + 1;
} else {
    right = mid - 1;
}
```
## Question 3
1. This is the main method of the program, which initializes a String array called string with three string values. It then calls the longestCommonPrefix method with string as an argument and assigns the returned string to longestPrefix. Finally, it prints out the longest common prefix found in the array.
```java
public static void main(String[] args) {
    String[] string = {"arkesel", "arkars", "arkell"}; //SAMPLE DATASET
    String longestPrefix = longestCommonPrefix(string);
    System.out.println("Longest common prefix: " + longestPrefix);
}
```
2. This line starts a while loop that continues as long as the current string in the input array does not start with the current prefix string. In that case, it shortens the prefix string by one character at a time using the substring method, and checks if it is empty. If the prefix string becomes empty, the method returns an empty string since there is no common prefix.
```java
while (strs[i].indexOf(prefix) != 0) {
    prefix = prefix.substring(0, prefix.length() - 1);
    if (prefix.isEmpty()) {
        return "";
    }
}
```
3. This line returns the final prefix string, which represents the longest common prefix shared by all strings in the input array.
```java
return prefix;
```

## Question 4
1. If the input array is null or empty, return an empty array.
2. Sort the input array based on the starting points of the intervals.
3. Initialize a new list to store the merged intervals.
4. Initialize a variable current to the first interval in the sorted input array.
5. Iterate over the remaining intervals in the input array, starting from the second interval.
6. If the current interval overlaps with the next interval, update the end point of the current interval to the maximum of the two end points.
7. If the current interval does not overlap with the next interval, add the current interval to the list of merged intervals and set the current interval to the next interval.
8. After iterating over all intervals, add the final current interval to the list of merged intervals.
9. Convert the list of merged intervals to an array and return it.


## Question 5
1. First, we check if the linked list is empty or has only one node. If this is the case, then the linked list cannot have a cycle, so we return false
```java
if (head == null || head.next == null) {
    return false;
}
```
2. Next, we initialize two pointers: `slow` and `fast`. The `slow` pointer moves one node at a time, while the fast pointer moves two nodes at a time.
```java
ListNode slow = head;
ListNode fast = head.next;
```
3. We enter a loop that continues as long as the slow pointer does not equal the fast pointer. If the linked list has a cycle, then the fast pointer will eventually catch up to the slow pointer. If the linked list does not have a cycle, then the fast pointer will reach the end of the list (null) before catching up to the slow pointer.
```java
while (slow != fast) {
    // code goes here
}
```
4. At each iteration of the loop, we check whether the fast pointer is null or fast.next is null. If either of these conditions is true, then we know that the linked list does not have a cycle, so we return false.
```java
if (fast == null || fast.next == null) {
    return false;
}
```
5. If we exit the loop without returning false, then we know that the linked list has a cycle, so we return true.
```java
return true;
```
