import java.util.ArrayList;
public class StepTracker
{
 private int steps;
 private int totalSteps;
 private int totalDays;
 private int daysActive;

 public StepTracker(int goal){
  steps = goal;
  totalSteps = 0;
  totalDays = 0;
  daysActive = 0;
} 

public void addDailySteps(int steps){
 steps += steps;
 totalDays++;
 if(steps >= steps)
  daysActive++;
}
 public int activeDays(){
  return daysActive;
 }
 public double averageSteps(){
  if(totalDays == 0)
    return 0.0;
  else
   return (double) totalSteps / totalDays;
 }
}
