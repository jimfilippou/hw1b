### Find first and last occurence of element within a sorted array in O(logn)

##### Running

First and foremost, open _ExercisesSet1.java_ and comment/uncomment lines 7/8 depending on what algorithm you want to run. Then do the following.

`cd src`

`javac *.java`

`java ExercisesSet1`

The place will be filled with .class files but eh.

You could use something like this not only for this project but for future ones as well for a cleaner barebones setup.

```bash
#!/bin/bash
mkdir -p build;
javac src/*.java;
for i in $( ls src | grep class ); do
  mv "src/$i" build/
done
```

### Three way QuickSort algorithm

Algorithm complexity

| Average case | Worst case |
|--------------|------------|
| O(nlogn)     | O(n^2)     |

##### Running

Once again, open _ExercisesSet1.java_ and comment/uncomment lines 7/8 depending on what algorithm you want to run. Then do the following.

`cd src`

`javac *.java`

`java ExercisesSet1`

