package softuni.workshop.data.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "projects")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectsRootDto {

    @XmlElement(name = "project")
    private List<ProjectDto> projectDtos;

    public ProjectsRootDto() {
    }

    public List<ProjectDto> getProjectDtos() {
        return projectDtos;
    }

    public ProjectsRootDto setProjectDtos(List<ProjectDto> projectDtos) {
        this.projectDtos = projectDtos;
        return this;
    }
}
