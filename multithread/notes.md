## 3 ways to create to create the thread
1. Extending Thread class
2. Implementing Runnable interface
3. Implementing Callable Interface

## Thread States
1. New
2. Runnable
3. Running
4. Dead
5. Sleep
6. Wait
7. Blocked

### NOTE: if you call start() method on same thread twice or more times, you will get IllegalThreadStateException. That is we cannot reuse the same thread again. Solution for this problem is using " thread pool "