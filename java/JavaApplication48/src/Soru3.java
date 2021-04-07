class Soru3 {
    public static void main(String[] args) {
        dortIslemHesapla("15/3", "15*3", "4+7", "11-3", "16*2");
    }

    public static void dortIslemHesapla(String... prb) {

        for (String p : prb) {
            if (p.indexOf("+") >= 0) {
                String[] nums = p.split("\\+");

                int n1 = Integer.parseInt(nums[0]);
                int n2 = Integer.parseInt(nums[1]);
                System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
            } else if (p.indexOf("-") >= 0) {
                String[] nums = p.split("\\-");

                int n1 = Integer.parseInt(nums[0]);
                int n2 = Integer.parseInt(nums[1]);
                System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
            } else if (p.indexOf("*") >= 0) {
                String[] nums = p.split("\\*");

                int n1 = Integer.parseInt(nums[0]);
                int n2 = Integer.parseInt(nums[1]);
                System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
            } else if (p.indexOf("/") >= 0) {
                String[] nums = p.split("\\/");

                int n1 = Integer.parseInt(nums[0]);
                int n2 = Integer.parseInt(nums[1]);
                System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
            } else {
                System.out.println(p);
            }
        }
    }
}

