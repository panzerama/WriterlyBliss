package writerlybliss.jd.writerlybliss.Data

import writerlybliss.jd.writerlybliss.Data.Models.Project

interface ProjectRepository {
    val projects: List<Project>

    fun getProjectBy(id: Int): Project
}