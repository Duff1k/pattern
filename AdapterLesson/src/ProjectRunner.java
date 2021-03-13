public class ProjectRunner extends ProjectTeam implements Development{
    @Override
    public void backend() {
        backendDevelop();
    }

    @Override
    public void frontend() {
        frontendDevelop();
    }

    @Override
    public void teamlead() {
        teamLeadDevelop();
    }
}
