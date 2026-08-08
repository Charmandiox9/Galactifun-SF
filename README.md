<div align="center">

# 🪐 Galactifun

**An advanced space exploration, planetary systems, rocketry, and astronomy addon for Slimefun4.**

[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.21.4-brightgreen.svg?style=for-the-badge&logo=minecraft)](https://papermc.io/)
[![Server Support](https://img.shields.io/badge/Server-Paper%20%2F%20Purpur-blue.svg?style=for-the-badge&logo=paper)](https://papermc.io/)
[![Java Version](https://img.shields.io/badge/Java-21%2B-orange.svg?style=for-the-badge&logo=openjdk)](https://adoptium.net/)
[![Slimefun](https://img.shields.io/badge/Slimefun-v4.0-yellow.svg?style=for-the-badge)](https://github.com/Slimefun/Slimefun4)
[![License](https://img.shields.io/badge/License-GPLv3-blueviolet.svg?style=for-the-badge)](LICENSE)

</div>

---

## 📖 Overview

**Galactifun** transforms your Minecraft server into a vast solar system with realistic planetary physics, space suits, rocketry, custom alien ecosystems, and high-tech manufacturing.

Inspired by *GalactiCraft* and *ClayTech*, redesigned and modernized for **Paper 1.21.4** and **Java 21**.

---

## ✨ Features

### 🌌 Celestial Bodies & Space Exploration
- **Planets & Moons**: Travel to **The Moon**, **Mars**, **Venus**, **Titan**, **Enceladus**, **Io**, and **Earth Orbit**.
- **Planetary Physics**: Each celestial body features custom **gravity**, unique **day/night cycles**, and custom **atmospheric gas profiles** (Oxygen, Carbon Dioxide, Methane, Nitrogen, etc.).
- **Space Hazards**: Harsh environments with extreme temperatures, toxic radiation, pressure differences, and lack of oxygen.

### 🚀 Rockets & Launch Systems
- **Chemical & Ion Rockets**: Build modular multi-tier spacecraft capable of reaching distant orbits.
- **Launch Pads & Fueling**: Construct functional launch pads and fuel your rockets with customized propellant tanks.
- **Interplanetary Navigation**: Real-time trajectory calculation and landing protocols.

### 🧑‍🚀 Spacesuits & Life Support
- **Modular Space Suits**: Upgrade helmets, chestplates, leggings, and boots with specialized modules.
- **Environmental Protection**: Thermal regulators, radiation shields, and oxygen scrubbers.
- **Oxygen Sealers & Habitat Systems**: Build pressurized, breathable bases on foreign planets without needing a suit.

### ⚙️ High-Tech Machinery & Power
- **Assembly Table**: Craft complex aerospace components and microcircuits.
- **Fusion Reactor**: High-output clean energy generator.
- **Atmospheric Harvester**: Extract rare planetary gases from local atmospheres.
- **Diamond Anvil & Circuit Press**: Precision material refinement.

### 👾 Aliens & Custom Mobs
- Encounter hostile and passive extraterrestrial entities such as **Martians**, **Moon Cows**, **Firestorms**, and parasitic **Leeches** featuring custom AI goals.

### 🌀 Stargates & Teleportation Networks
- Construct deep-space **Stargate Controllers** and portal rings to bridge immense cosmic distances instantly.

---

## 📦 Requirements

| Requirement | Supported Versions |
|:---|:---|
| **Server Engine** | [Paper](https://papermc.io/) or [Purpur](https://purpurmc.org/) **1.21.4+** |
| **Java Runtime** | **Java 21** or newer |
| **Dependencies** | [Slimefun4](https://github.com/Slimefun/Slimefun4) (RC-38 or newer) |
| **Optional Integrations** | [Multiverse-Core](https://github.com/Multiverse/Multiverse-Core), [BentoBox](https://bentobox.world/) |

---

## 🛠️ Commands & Permissions

| Command | Description | Permission |
|:---|:---|:---|
| `/galactifun` (aliases: `/gfun`, `/galactic`) | Displays Galactifun version & addon info | `galactifun.command` |
| `/galactifun alien spawn <alien_id>` | Spawns a custom extraterrestrial entity | `galactifun.command.alien.spawn` |
| `/galactifun alien killall` | Removes all spawned alien entities | `galactifun.command.alien.killall` |
| `/galactiport <destination>` | Teleport directly to a planetary world | `galactifun.command.galactiport` |
| `/sf guide` | Opens the Slimefun guide with all 13 Galactifun categories | *Default Slimefun access* |

---

## 🔨 Building & Developing

### Compile with Gradle
```bash
# Clone the repository
git clone https://github.com/Charmandiox9/Galactifun-SF.git
cd Galactifun-SF

# Build the shaded jar
./gradlew shadowJar

# The output jar will be in:
# build/libs/Galactifun-1.21.0.jar
```

### Run Local Test Server
```bash
./gradlew runServer
```

---

## 👥 Authors & Contributors

- **Seggan** - Original Creator
- **Mooy1** - Core Contributor
- **GallowsDove** - Design & Lore
- **ProfElements** - Mechanics
- **Charmandiox9** - Modernization to 1.21.4, Java 21, & In-source InfinityLib Refactoring

---

## 📄 License

This project is licensed under the **GNU General Public License v3.0** (GPLv3).