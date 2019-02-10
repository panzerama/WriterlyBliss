package writerlybliss.jd.writerlybliss.Data.Models

class Project(projectName: String, projectWordCount: Int, projectWordGoal: Int) {
    var projectName = projectName;
    var projectWordCount = projectWordCount;
    var projectWordGoal = projectWordGoal;

    fun getProjectProgress(): Int {
        return projectWordCount / projectWordGoal;
    }
}