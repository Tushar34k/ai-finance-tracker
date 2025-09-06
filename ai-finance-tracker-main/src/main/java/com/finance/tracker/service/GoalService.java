package com.finance.tracker.service;

import com.finance.tracker.model.Goal;

import java.util.List;

public interface GoalService {
    Goal createGoal(Long userId, Goal goal);
    List<Goal> getGoalsByUser(Long userId);
    Goal updateGoal(Long id, Goal goal);
    void deleteGoal(Long id);
    Double getGoalProgress(Long id);
}
