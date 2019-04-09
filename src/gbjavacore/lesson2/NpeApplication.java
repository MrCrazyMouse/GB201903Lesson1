package gbjavacore.lesson2;

public class NpeApplication {
    public NpeApplication() {
    }

    public void method() {
    }

    public static void main(String[] args) {
        Object str;
        try {
            str = null;
            int var2 = (int) str;
        } catch (NullPointerException var8) {
            var8.printStackTrace();
        }

        try {
            str = null;
            Object var10 = str;
            int var3 = ((Object[])str).length;

            for(int var4 = 0; var4 < var3; ++var4) {
                int val = (int)((Object[])var10)[var4];
                System.out.println(val);
            }
        } catch (NullPointerException var9) {
            var9.printStackTrace();
        }

        try {
            str = null;
            ((NpeApplication)str).method();
        } catch (NullPointerException var7) {
            var7.printStackTrace();
        }

        try {
            str = null;
            ((String)str).equals("sdfsdf");
            "sdfsdf".equals(str);
        } catch (NullPointerException var6) {
            var6.printStackTrace();
        }

    }
}
