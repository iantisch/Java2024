package task_4_3_2;

public class StringBuilder {
    private final String str;

    public StringBuilder() {
        this.str = new String();
    }

    public StringBuilder append(java.lang.String str) {
        this.str.append(str);
        return this;
    }

    public StringBuilder append(String str) {
        return append(str.getStr());
    }

    public StringBuilder incert(java.lang.String str, int index) {
        this.str.incert(str, index);
        return this;
    }

    public StringBuilder incert(String str, int index) {
        return incert(str.getStr(), index);
    }

    public StringBuilder deleteSubString(int start, int length) {
        this.str.deleteSubString(start, length);
        return this;
    }

    public StringBuilder replace(java.lang.String str, int start, int length) {
        this.str.replace(str, start, length);
        return this;
    }

    public StringBuilder replace(String str, int start, int length) {
        return replace(str.getStr(), start, length);
    }

    public String build() {
        return this.str;
    }
}
