package chap04.exercise;

public class prob09 {
    int w, h;

    prob09(int w, int h) {
        this.w = w;
        this.h = h;
    }

    prob09(int w) {
        this.w = w;
        this.h = 2;
    }

    prob09() {
        this.w = 1;
        this.h = 2;
    }
}


/*

public class Rectangle {
    int w, h;
    Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    Rectangle(int w) {
        this(w,2);
    }

    Rectangle(int h) {
        this(1);
    }
}

*/