## The Maze - Problem Statement
________

A maze is a network of paths and hedges designed as a puzzle through which one has to find a way. The maze always has an entry point through which one enters; the objective is to reach the destination without running against an obstacle. 

![Maze](https://cdn2.scratch.mit.edu/get_image/project/137270208_1440x1080.png)

The positions in the maze will either be open or blocked by an obstacle. You can move to positions without the obstacles, which will be the solution to find paths containing only open cells. Retracing the one or more cells is not considered a new path. At any given moment, you can move only one-step in any one of the four directions.
At each step, you can move either north, south, east or west.
		 
- Go North (x,y) -> (x-1,y)
- Go South (x,y) -> (x+1,y)
- Go East  (x,y) -> (x,y+1)
- Go West  (x,y) -> (x,y-1)

**Task 1:**

Write a Java program to build the skeleton of the maze using ascii characters and print it. 

Hint : The maze must be built from an array.
> Sample Output

    The maze skeleton
    -----------------
    ‡S‡‡‡‡‡‡‡‡‡‡‡
    ‡ ‡ ‡ ‡     ‡
    ‡ ‡   ‡ ‡‡‡ ‡
    ‡   ‡‡‡     ‡
    ‡ ‡     ‡‡‡ ‡
    ‡ ‡ ‡‡‡ ‡   ‡
    ‡ ‡ ‡   ‡‡‡ ‡
    ‡ ‡ ‡‡‡ ‡ ‡ ‡
    ‡         ‡E‡
    ‡‡‡‡‡‡‡‡‡‡‡‡‡
    S represents the start point and E represents the end point
    
**Task 2:**

Write a Java program to find the unique path in the maze from start point to end point recursively, use the rules mentioned in the problem statement above to solve the maze. The path should be denoted using the ‘*’ symbol;

> Sample Output

    The solved maze 
    -----------------
    ‡*‡‡‡‡‡‡‡‡‡‡‡
    ‡*‡ ‡ ‡     ‡
    ‡*‡   ‡ ‡‡‡ ‡
    ‡*  ‡‡‡*****‡
    ‡*‡    *‡‡‡*‡
    ‡*‡ ‡‡‡*‡  *‡
    ‡*‡ ‡  *‡‡‡*‡
    ‡*‡ ‡‡‡*‡ ‡*‡
    ‡*******  ‡E‡
    ‡‡‡‡‡‡‡‡‡‡‡‡‡




