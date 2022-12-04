package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pneumatics extends SubsystemBase {
    public DoubleSolenoid m_doubleSolenoid =  new DoubleSolenoid(PneumaticsModuleType.CTREPCM,
                 Constants.dSolenoid_forwardChannel, Constants.dSolenoid_reverseChannel);
    public Compressor m_Compressor = new Compressor(Constants.compressor_module, PneumaticsModuleType.CTREPCM);

    public int pistonOutAmount = 0;
    public int pistonInAmount = 0;
    


    public Pneumatics() {
    //    Compressor m_Compressor = new Compressor(Constants.compressor_module, PneumaticsModuleType.CTREPCM);


    //     DoubleSolenoid m_doubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,
    //             Constants.dSolenoid_forwardChannel, Constants.dSolenoid_reverseChannel);

    }

    public void pistonOut() {
        pistonOutAmount++;
        System.out.println("PistonOut: "+pistonOutAmount);
        m_doubleSolenoid.set(Value.kForward);
    }

    public void pistonIn() {
        pistonInAmount++;
        System.out.println("PistonIn: "+pistonInAmount);
        m_doubleSolenoid.set(Value.kReverse);
    }

    public void periodic() {

    }

}
