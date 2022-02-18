// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number}
 */
var getDecimalValue = function(head) {
    var array = [];
    let current = head;
    while(current){
        array.push(current.val);
        current = current.next;
    }
    const binary = array.join("");
    var decimal = parseInt(binary,2);
    return decimal;
};