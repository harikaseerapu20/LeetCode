/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    const numToIndex = new Map();

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (numToIndex.has(complement)) {
            return [numToIndex.get(complement), i];
        }
        numToIndex.set(nums[i], i);
    }
};
console.log(twoSum([2, 7, 11, 15], 9)); // Output: [0,1]
console.log(twoSum([3, 2, 4], 6));     // Output: [1,2]
console.log(twoSum([3, 3], 6));       // Output: [0,1]
