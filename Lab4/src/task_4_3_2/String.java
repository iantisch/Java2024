package task_4_3_2;

public class String {
    private java.lang.String str;

    public String(java.lang.String str) {
        this.str = str;
    }

    public String() {
        this.str = "";
    }

    public java.lang.String getStr() {
        return str;
    }

    @Override
    public java.lang.String toString() {
        return this.str;
    }

    public void append(java.lang.String str) {
        this.str += str;
    }

    public void append(String str) {
        append(str.getStr());
    }

    public void incert(java.lang.String str, int index) {
        if (index < 0 || index > this.str.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.str = this.str.substring(0, index) + str + this.str.substring(index);
    }

    public void incert(String str, int index) {
        incert(str.getStr(), index);
    }

    public void deleteSubString(int start, int length) {
        if (start < 0 || start > this.str.length() || length < 0 || (start + length) > this.str.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.str = this.str.substring(0, start) + this.str.substring(start + length);
    }

    public void replace(java.lang.String str, int start, int length) {
        if (start < 0 || start > this.str.length() || length < 0 || (start + length) > this.str.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.str = this.str.substring(0, start) + str + this.str.substring(start + length);
    }

    public void replace(String str, int start, int length) {
        replace(str.getStr(), start, length);
    }
}
