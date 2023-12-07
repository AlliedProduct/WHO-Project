/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WHO;

/**
 *
 * @author kdoma
 */
public class Top {
    private String incentiveId;
    private String name;
    private String description;

    public Top(String incentiveId, String name, String description) {
        this.incentiveId = incentiveId;
        this.name = name;
        this.description = description;
    }

    // Getters and setters (you can generate these using your IDE)
    public String getIncentiveId() {
        return incentiveId;
    }

    public void setIncentiveId(String incentiveId) {
        this.incentiveId = incentiveId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

