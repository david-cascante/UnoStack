package io.github.davidcascante.unostack.models;
import com.fasterxml.jackson.core.Version;
import java.util.List;

public class Module {
    private String type;           // "database"
    private String id;             // "mysql"
    private String name;           // "MySQL"
    private List<Version> versions; // Versiones del módulo
    private Defaults defaults;      // Configuración por defecto
    private List<Integer> other_ports; // Puertos extra

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Version> getVersions() { return versions; }
    public void setVersions(List<Version> versions) { this.versions = versions; }

    public Defaults getDefaults() { return defaults; }
    public void setDefaults(Defaults defaults) { this.defaults = defaults; }

    public List<Integer> getOther_ports() { return other_ports; }
    public void setOther_ports(List<Integer> other_ports) { this.other_ports = other_ports; }
}