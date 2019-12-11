package SimpleFactory;

public enum PhoneBrand {
    MIUI(001),
    HUAWEI(002),
    IPHONE(003);

    private int val;

    PhoneBrand(int No) {
        this.val = No;
    }

    public static PhoneBrand getENUM(int no) {
        PhoneBrand[] brands = PhoneBrand.values();
        for (PhoneBrand brand : brands) {
            if (brand.val == no) {
                return brand;
            }
        }
        return null;
    }

    public static int getVal(PhoneBrand brand) {
        return brand.val;
    }
}
