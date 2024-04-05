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


## SYNCHRONIZATION
* Synchronization in Java is a mechanism to control the access of multiple threads to shared resources. 
* It ensures that only one thread can access the shared resource at a time, preventing data inconsistency and race conditions.

## WHY SYNCHRONIZATION
* In multi-threaded environments, where multiple threads execute concurrently, synchronization becomes crucial to maintain data integrity.
* Without synchronization, concurrent access to shared resources can lead to unpredictable behavior, such as race conditions, data corruption, and inconsistent results.

## Synchronization Mechanisms in Java
Java provides several mechanisms for synchronization:
 
1. <b>Synchronized Methods:</b> By declaring methods as synchronized, only one thread can execute the method at a time for a particular instance of the class.

2. <b>Synchronized Blocks:</b> These blocks allow synchronized access to specific segments of code, instead of entire methods.

3. <b>Volatile Keyword:</b> The volatile keyword ensures that changes made by one thread to shared variables are immediately visible to other threads.

4. <b>Locks (ReentrantLock, ReadWriteLock): </b> The java.util.concurrent.locks package provides advanced lock mechanisms for fine-grained control over synchronization.