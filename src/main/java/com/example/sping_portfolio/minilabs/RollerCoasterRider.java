package com.example.sping_portfolio.minilabs;


/*
A ride is opening in Six Flags. Since the ride has a steep drop at the end, it has a weight limit of atleast 130 pounds and
height limit at least 6 foot for the passengers safety. The following code is meant to turn down anyone who is under or equal to
six foot and 130 pounds.


 */
public class RollerCoasterRider {


    double height;
    int weight;
    public RollerCoasterRider(double he, int we)
    {
        height = he;
        weight = we;
    }
    public void SuperScreamer()
    {
        if(!(height<6) && !(weight<130))
        {
            System.out.println("You can ride the rollercoaster");
        }
        else if(!(weight>130) && !(height>6))
        {
            System.out.println("You cannot ride this rollercoaster because you do not match the weight and height requirement.");
        }
        else if(!(height>6))
        {
            System.out.println("You cannot ride the roller coaster because you are too short");
        }
        else if(!(weight>130))
        {
            System.out.println("You cannot ride this rollercoaster because you do not match the weight requirement.");
        }
    }
    public static void main(String[] args)
    {
        RollerCoasterRider riderOne = new RollerCoasterRider(5.9,120);
        riderOne.SuperScreamer();
    }
}
/*
Which output is printed for riderOne?

a. You can ride the rollercoaster

b. You cannot ride this rollercoaster because you do not match the weight and height requirement.

c. You cannot ride this rollercoaster because you do not match the weight and height requirement.
   You cannot ride the roller coaster because you are too short
   You cannot ride this rollercoaster because you do not match the weight requirement.

d. You cannot ride the roller coaster because you are too short
   You cannot ride this rollercoaster because you do not match the weight requirement.
 */
