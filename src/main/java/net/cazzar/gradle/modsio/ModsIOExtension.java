package net.cazzar.gradle.modsio;

import org.gradle.api.Project;
import org.gradle.api.UnknownDomainObjectException;

public class ModsIOExtension {
    public String apiKey;
    public String modId;
    public String minecraft;

    private Project project;

    public ModsIOExtension(Project project) {
        this.project = project;

        if (minecraft == null) {
            try {
                minecraft = (String) project.getExtensions().getByName("minecraft").getClass().getField("version").get(project.getExtensions().getByName("minecraft"));
                if (minecraft.indexOf('-') != 0) {
                    minecraft = minecraft.substring(0, minecraft.indexOf('-'));
                }
            } catch (UnknownDomainObjectException ignored) {
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getModId() {
        return modId;
    }

    public String getMinecraft() {
        if (minecraft == null) {
            try {
                minecraft = (String) project.getExtensions().getByName("minecraft").getClass().getField("version").get(project.getExtensions().getByName("minecraft"));
                if (minecraft.indexOf('-') != 0) {
                    minecraft = minecraft.substring(0, minecraft.indexOf('-'));
                }
            } catch (UnknownDomainObjectException ignored) {
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

        return minecraft;
    }
}
