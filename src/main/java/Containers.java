/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WENDY
 */
public class Containers {

    private int cFirst;
    private int cSecond;

    public Containers(int first, int second) {
        this.cFirst = first;
        this.cSecond = second;
    }

    public int addLiquid(int liters) {
        if (liters > 0) {
            this.cFirst = this.cFirst + liters;
        } else {
            this.cFirst = this.cFirst;
        }
        if (this.cFirst >= 100) {
            this.cFirst = 100;
        }
        return this.cFirst;
    }

    public int moveLiquid(int liters) {

        if (liters >= 0) {

            if (this.cFirst >= liters) {
                this.cFirst = this.cFirst - liters;
                this.cSecond = this.cSecond + liters;
                if (this.cSecond >= 100) {
                    this.cSecond = 100;
                }
            } else {
                this.cSecond = this.cSecond + this.cFirst;
                if (this.cSecond >= 100) {
                    this.cSecond = 100;
                }
            }

        } else {
            this.cFirst = cFirst;
            this.cSecond = cSecond;
        }

        return this.cSecond;
    }

    public int removeLiquid(int liters) {
        if (liters >= 0) {
            if (this.cSecond < liters) {
                this.cSecond = 0;
            } else {
                this.cSecond = this.cSecond - liters;
            }
        } else {
            this.cSecond = cSecond;
        }
        return this.cSecond;
    }

    @Override
    public String toString() {
        return "First: " + this.cFirst + "/100" + "\n" + "Second: " + this.cSecond + "/100";
    }

}
