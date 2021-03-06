// FILE: ExceptionTracker.kt

trait ExceptionTracker : <!CYCLIC_INHERITANCE_HIERARCHY!>LockBasedStorageManager.ExceptionHandlingStrategy<!> {
}

// FILE: StorageManager.kt

trait StorageManager : <!CYCLIC_INHERITANCE_HIERARCHY!>ExceptionTracker<!> {
    fun foo()
}

// FILE: LockBasedStorageManager.java

class LockBasedStorageManager extends StorageManager {
    interface ExceptionHandlingStrategy {
        void bar();
    }

    @Override
    void foo() {}
}
