# Insertion-Sort-Projesi
**[22,27,16,2,18,6] -> Insertion Sort
*Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
*Big-O gösterimini yazınız.
*Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
*Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

*[22,27,16,2,18,6]
[2,27,16,22,18,6]
[22,6,16,22,18,27]

*Big O Notation - n.(n-1)= n²-n = O(n²)

*18 sayısı dizinin orta kısmında olduğundan olduğundan average case kapsamındadır.

**[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

*[2,3,5,8,7,9,4,15,6]
[2,3,4,8,7,9,5,15,6]
[2,3,4,5,7,9,8,15,6]
[2,3,4,5,6,9,8,15,7]


#Merge-Sort-Projesi

**[16,21,11,8,12,22] -> Merge Sort
Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
Big-O gösterimini yazınız.

*[16,21,11,8,12,22]
[16,21,11]          [8,12,22]
[16]  [21,11]       [8]   [12,22]
[16]  [21]  [11]    [8]  [12]  [22]   
[16]   [11,21]      [8]   [12,22]
[11,16,21]          [8,12,22]

*Big O Notation - n.(logn)


#Binary Search Tree Projesi
**[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.
Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

                  [7]
           [4]          [8]   
       [2]    [5]    [6]    [9]
     [1]  [3]
     [0]
