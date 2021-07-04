package com.hellospring.controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MachineInfo {
    public MachineInfo(){}
    public MachineInfo(Platform platform)
    {
        this.platform = platform;
    }
    private int id;
    private Platform platform;
	@NotBlank(message = "機材のホスト名を入力して下さい")
    @Size(max=128)
    private String host_name;
    @NotBlank(message = "機材の所有者を入力して下さい")
    @Size(max=128)
    private String owner;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Platform getPlatform() {
		return platform;
	}
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}