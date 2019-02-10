package writerlybliss.jd.writerlybliss.Data

import writerlybliss.jd.writerlybliss.Data.Models.Project

class ProjectRepository {
    val rebeccasProject = Project("Moby Dick", 10000, 100000)
    val jasonsProject = Project("Alistair Bentley", 30000, 100000)
    val gabesProject = Project("A Strange Thing Happened", 70000, 100000)
    val projects = listOf<Project>(rebeccasProject, jasonsProject, gabesProject)

    fun getProjectBy(id: Int): Project {
        when (id) {
            1 -> return rebeccasProject
            2 -> return jasonsProject
            3 -> return gabesProject
            else -> return rebeccasProject
        }
    }
}